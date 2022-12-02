package adapter;

public class MathFloat implements MathAdapter{

	@Override
	public Float twiceAdapter(Float f) {
		return (float) Math.twoTime(f);
	}

	@Override
	public Float halfAdapter(Float f) {
		return (float) Math.half(f);
	}
}
