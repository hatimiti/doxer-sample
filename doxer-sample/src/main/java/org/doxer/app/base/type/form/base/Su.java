package org.doxer.app.base.type.form.base;

import org.doxer.xbase.form.type.SingleFormType;

import com.github.hatimiti.doxer.common.domain.supports.InputAttribute;
import com.github.hatimiti.doxer.common.message.AppMessagesContainer;
import com.github.hatimiti.doxer.common.message.Owner;
import com.github.hatimiti.doxer.common.util._Num;
import com.github.hatimiti.doxer.common.validation.validator.IntFieldValidator;
import com.github.hatimiti.doxer.common.validation.validator.MaxLengthFieldValidator;

public abstract class Su extends SingleFormType {

	public Su(InputAttribute inputAttribute, String propertyName, String label) {
		super(inputAttribute, propertyName, label);
	}

	public Long getValL() {
		return _Num.asLongOrNull(this.val);
	}

	@Override
	protected void validateCustom(AppMessagesContainer c, Owner owner) {
		new MaxLengthFieldValidator(c).max(length()).check(vval(), owner, label(), length());
		new IntFieldValidator(c).check(vval(), owner, label());
	}

}
