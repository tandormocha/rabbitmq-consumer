package com.yiche.pojo;

/**
 * @author kouyy
 */
public class ConsumerMsg {
	    public HeaderEntry Header;
	    public BodyEntry Body;

	    public HeaderEntry getHeader() {
	        return Header;
	    }

	    public void setHeader(HeaderEntry header) {
	        Header = header;
	    }

	    public BodyEntry getBody() {
	        return Body;
	    }

	    public void setBody(BodyEntry body) {
	        Body = body;
	    }
	}
