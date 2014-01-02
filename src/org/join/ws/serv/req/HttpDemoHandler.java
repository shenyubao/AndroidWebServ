package org.join.ws.serv.req;

import java.io.IOException;
import java.net.URLDecoder;

import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestHandler;
import org.join.ws.Constants.Config;

import android.util.Log;

public class HttpDemoHandler implements HttpRequestHandler{

	@Override
	public void handle(HttpRequest request, HttpResponse response,
			HttpContext context) throws HttpException, IOException {

        String target = URLDecoder.decode(request.getRequestLine().getUri(), Config.ENCODING);

	     Log.v("DEV", target);		
		 response.setStatusCode(HttpStatus.SC_OK);
	}

}
