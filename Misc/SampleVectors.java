public class SampleVectors {
	int value;
	PVector position;
	PVector pixelPos;

	SampleVectors(int x, int y){
		if(random(1) < 0.1) {
			value = 4;
		}else {
			value = 2;
		}

		position = new PVector(x, y);
		pixelPos = new PVector(x*200 + (x+1), y*200);
	}
}