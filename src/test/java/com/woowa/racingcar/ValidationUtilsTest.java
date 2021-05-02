package com.woowa.racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {
	
	@Test
	@DisplayName(value = "자동차_이름_구분_검증")
	void 자동차_이름_구분_검증() {
		assertThat(ValidationUtils.validCarNameSeparator("A")).isEqualTo(1);
		assertThat(ValidationUtils.validCarNameSeparator("A,B,C,D")).isEqualTo(4);
		assertThat(ValidationUtils.validCarNameSeparator("A,B,C,")).isEqualTo(3);
		assertThat(ValidationUtils.validCarNameSeparator(",")).isEqualTo(0);
		assertThat(ValidationUtils.validCarNameSeparator(",,")).isEqualTo(0);
		assertThat(ValidationUtils.validCarNameSeparator(",,,")).isEqualTo(0);
		assertThat(ValidationUtils.validCarNameSeparator("")).isEqualTo(0);
	}
	
	@Test
	@DisplayName(value = "자동차_이름_길이_검증")
	void 자동차_이름_길이_검증() {
		assertThat(ValidationUtils.validCarNameLength("MYCAR")).isTrue();
		assertThat(ValidationUtils.validCarNameLength("M")).isTrue();
		assertThat(ValidationUtils.validCarNameLength("MYGOODCAR")).isFalse();
		assertThat(ValidationUtils.validCarNameLength("")).isFalse();
		assertThat(ValidationUtils.validCarNameLength("  ")).isFalse();
	}
}
