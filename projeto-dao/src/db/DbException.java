package db;

public class DbException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	//forçar essa exceção ser lançada com o construtor na super classe RunTimeException
	public DbException(String msg) {
		super(msg);
	}
	
}
