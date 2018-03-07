package paquete;

public class ResolveP {

	int iPtsGirl = 0;
	int n = 5;
	int r = 5;
	String sAux = " ";
	Boolean isEnd = false;

	ResolveP(int[] arrBoy, int[] arrGirl) {
		String[] arrStrGirl = new String[5];
		System.arraycopy(arrGirl, 0, arrStrGirl, 0, arrGirl.length);
		methodResolve(arrStrGirl, sAux, n, r);
	}

	private void methodResolve(String[] arrStrGirl, String sAux, int n2, int r2) {
		if (n == 0) {
			System.out.println(sAux);
		} else {
			for (int i = 0; i < r; i++) {
				if (!String.valueOf(sAux).contains(arrStrGirl[i])) { // Controla que no haya repeticiones
					methodResolve(arrStrGirl, sAux + arrStrGirl[i] + ", ", n - 1, r);
				}
			}
		}		
	}
}
