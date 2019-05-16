package co.grandcircus;

public class PrimeFinder {

	//Method to check if an input is a prime number
	public int rfind(int in) {
		int counter = 2;
		for (int i = 1; i < in ; i++) {
			if (in % (in - i) != 0) {
				counter++;
			}
		}
			if (counter == in) {
				return in;
			} else {
				return 0;
			}
	}

	//Method to return the prime number in the sequence of primes at the index of the input (int)
	public int find(int in) {
		int out = 0;
		int counter = 0;
		for (int i = 1; counter < in; i++) {
			if (rfind(i) != 0) {
				counter++;
				out = rfind(i);
			}
		}
		return out;
	}

//	public int xfind(int in) {
//	int p = 0;
//	int counter = 0;
//	for (int i = 1; i < in; i++) {
//
//		for (int j = i; counter <= in; j++) {
//
//			for (int k = j - 1; k > 1; k--) {
//
//				if (j % (j - k) != 0)
//					continue;
//				else {
//					p = j;
//					counter++;
//				}
//			}
//		}
//	}
//	return p;
//
//}

//public int find(int i) {
//	if (i < 3)
//		return i + 1;
//	if (i == 3)
//		return i + 2;
//	if (i == 4)
//		return i + 3;
//	if (i == 5)
//		return i + 6;
//	if (i == 6)
//		return i + 7;
//	else {
//		
//	}
//}

//public int xxfind(int in) {
//	for (int i = 1; i < 100 + 1; i++) {
//		if (in % 2 != 0 & in % 3 != 0 & in % 5 != 0 & in % 7 != 0)
//			in++;
//		else
//			break;
//
//	}
//	return in;
//}
}
