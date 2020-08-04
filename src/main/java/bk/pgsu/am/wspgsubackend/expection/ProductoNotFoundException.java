package bk.pgsu.am.wspgsubackend.expection;

import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductoNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProductoNotFoundException(@Nullable String s) {
		super(s);
	}
	
	public ProductoNotFoundException(@Nullable String s, @Nullable Throwable throwable) {
		super(s,throwable);
	}

}
