package com.woowa.racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {

	@Test
	@DisplayName(value = "자동차_이름_길이_검증")
	void 자동차_이름_길이_검증() {
		assertThat( ValidationUtils.validCarNameLength("MYCAR")).isTrue();
		assertThat( ValidationUtils.validCarNameLength("C")).isTrue();
	}
}
