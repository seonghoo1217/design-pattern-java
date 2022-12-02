import adapter.MathAdapter;
import adapter.MathFloat;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdapterPatternTest {

	@Test
	void 어댑터패턴이_정상작동하여_옳바른값_배출(){
		MathAdapter mathAdapter=new MathFloat();
		assertThat(mathAdapter.halfAdapter(100f)).isEqualTo(50.0f);
	}

	@Test
	void 어댑터패턴이_정상작동(){
		MathAdapter mathAdapter=new MathFloat();
		assertThat(mathAdapter.halfAdapter(100f).getClass()).isEqualTo(Float.class);
	}
}
