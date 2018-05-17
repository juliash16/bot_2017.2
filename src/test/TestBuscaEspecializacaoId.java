package test;

import implement.EspecializacaoDAOImp;

public class TestBuscaEspecializacaoId {
	public static void main (String[] args) {
		EspecializacaoDAOImp imp = new EspecializacaoDAOImp();
		
		System.out.println(imp.buscarPorId(1));
	}
}
