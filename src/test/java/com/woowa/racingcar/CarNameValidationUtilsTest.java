package com.woowa.racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.woowa.utils.CarNameValidationUtils;

public class CarNameValidationUtilsTest {
	
	@Test
	@DisplayName(value = "자동차_이름_구분_검증")
	void 자동차_이름_구분_검증() {
		assertThat(CarNameValidationUtils.validCarNameSeparator("A")).isEqualTo(1);
		assertThat(CarNameValidationUtils.validCarNameSeparator("A,B,C,D")).isEqualTo(4);
		assertThat(CarNameValidationUtils.validCarNameSeparator("A,B,C,")).isEqualTo(3);
		assertThat(CarNameValidationUtils.validCarNameSeparator(",")).isEqualTo(0);
		assertThat(CarNameValidationUtils.validCarNameSeparator(",,")).isEqualTo(0);
		assertThat(CarNameValidationUtils.validCarNameSeparator(",,,")).isEqualTo(0);
		assertThat(CarNameValidationUtils.validCarNameSeparator("")).isEqualTo(0);
	}
	
	@Test
	@DisplayName(value = "자동차_이름_길이_검증")
	void 자동차_이름_길이_검증() {
		assertThat(CarNameValidationUtils.validCarNameLength("MYCAR")).isTrue();
		assertThat(CarNameValidationUtils.validCarNameLength("M")).isTrue();
		assertThat(CarNameValidationUtils.validCarNameLength("MYGOODCAR")).isFalse();
		assertThat(CarNameValidationUtils.validCarNameLength("")).isFalse();
		assertThat(CarNameValidationUtils.validCarNameLength("  ")).isFalse();
	}
}
