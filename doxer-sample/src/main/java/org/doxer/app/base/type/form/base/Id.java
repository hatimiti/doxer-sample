package org.doxer.app.base.type.form.base;

import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.doxer.common.domain.supports.InputAttribute;
import com.github.hatimiti.doxer.common.message.AppMessagesContainer;
import com.github.hatimiti.doxer.common.message.Owner;
import com.github.hatimiti.doxer.common.util._Num;
import com.github.hatimiti.doxer.common.util._Str;
import com.github.hatimiti.doxer.common.validation.validator.LongFieldValidator;
import com.github.hatimiti.doxer.common.validation.validator.MaxLengthFieldValidator;

public abstract class Id extends SingleFormType {

	public Id(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	public Long getValL() {
		return _Num.asLongOrNull(this.val);
	}

	public void setStrictValL(Long val) {
		setStrictVal(_Str.asStrOrEmpty(val));
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		new MaxLengthFieldValidator(c).max(length()).check(vval(), owner, label(), length());
		new LongFieldValidator(c).check(vval(), owner, label());
	}

}
