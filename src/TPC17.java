import kr.tpc.OverLoad;

public class TPC17 {
	public static void main(String[] args) {
		// 1 + 1 = ?, 23.4 + 56 = ?, 56.7 + 78.9 = ?
		OverLoad ov = new OverLoad();
		ov.hap(1, 1); // ov.hap_int_int(1, 1) ��ǻ�ʹ� �̷� ������ �ν��ؼ� �ٷιٷ� �޼��� ȣ�� ����
		ov.hap(23.4f, 56); // ov.hap_float_int(23.4f, 56)
		ov.hap(56.7f, 78.9f); // ov.hap_float_float(56.7f, 78.9f)
	}
}