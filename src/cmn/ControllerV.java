package cmn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ControllerV {

	public void doWork(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException;
	
}
