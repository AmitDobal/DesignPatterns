package datastructure.bitsmagic;

public class BitMain {
	public static void main(String[] args) {
		Integer a = 2;
		Integer b = 1;
		Integer c = (b<<2)|a;
		c= ~(1<<2)& c;
		Integer bits = 32;

		System.out.println(a + ": " + Integer.toBinaryString(a));
		System.out.println(b + ": " + Integer.toBinaryString(b));
		System.out.println(c + "\t" + Integer.toBinaryString(c));
		System.out.println();
//		System.out.println("bits" + ":\t" + bitsMaxVal(bits));
		System.out.println(a + ":\t" + toBinaryBits(a, bits));
		System.out.println(b + ":\t" + toBinaryBits(b, bits));
		System.out.println(c + ":\t" + toBinaryBits(c, bits));
	}

	public static String toBinary(int a) {
		if (a == 0)
			return "0";
		StringBuilder sb = new StringBuilder();

		while (a > 0) {
			sb.append(a % 2);
			a /= 2;
		}
		return sb.reverse().toString();
	}

	public static String toBinaryBits(int num, int bits) {
		String binaryNum = toBinary(num);
		int addZero = bits - binaryNum.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < addZero; i++) {
			sb.append(0);
		}
		sb.append(binaryNum);
		return sb.toString();
	}

//	public static String bitsMaxVal(int bits) {
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < bits; i++) {
//			double pow = Math.pow(2, i);
//			sb.append( (int)pow).append(" ");
//		}
//
//		return sb.reverse().toString();
//	}
}
