package bk.pgsu.am.wspgsubackend.expection;

import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MarcaNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MarcaNotFoundException(@Nullable String s) {
		super(s);
	}
	
	public MarcaNotFoundException(@Nullable String s, @Nullable Throwable throwable) {
		super(s,throwable);
	}
}
