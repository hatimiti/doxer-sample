package org.doxer.app.sample.ad.login;

import static com.github.hatimiti.doxer.common.message.AppMessageLevel.*;
import static com.github.hatimiti.doxer.common.util._Str.*;

import javax.annotation.Resource;

import org.dbflute.optional.OptionalEntity;
import org.doxer.app.db.dbflute.exbhv.CmShainBhv;
import org.doxer.app.db.dbflute.exentity.CmShain;
import org.doxer.xbase.form.AccessUser;
import org.doxer.xbase.service.DoxService;
import org.springframework.stereotype.Service;

import com.github.hatimiti.doxer.common.message.AppMessage;
import com.github.hatimiti.doxer.common.message.AppMessagesException;

@Service
public class LoginService extends DoxService {

	@Resource AccessUser accessUser;
	@Resource CmShainBhv cmShainBhv;

	/*
	 * 一覧検索
	 */

	public void login(
			LoginForm form) {

		OptionalEntity<CmShain> shain = this.cmShainBhv.selectEntity(cb -> {
			cb.query().setLoginCd_Equal(form.getLoginCd().getVal());
			cb.query().setPassword_Equal(form.getPassword().encrypt());
		});

		shain.ifPresent(this::setAccessUserDto).orElse(() -> {
			throw new AppMessagesException(new AppMessage(WARN, "msg.error.login"));
		});
	}

	public void dummyLogin() {
		CmShain shain = new CmShain();
		shain.setCmShainId(0L);
		shain.setShainSei("ダミー");
		shain.setShainMei("ログイン");
		setAccessUserDto(shain);
	}

	private void setAccessUserDto(CmShain shain) {
		this.accessUser.setId(asStrOrNull(shain.getCmShainId()));
		this.accessUser.setLastName(shain.getShainSei());
		this.accessUser.setFirstName(shain.getShainMei());
		this.accessUser.setLogged(true);
	}
}
