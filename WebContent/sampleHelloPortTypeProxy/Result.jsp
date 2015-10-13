<%@page contentType="text/html;charset=UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
	<H1>Result</H1>

	<jsp:useBean id="sampleHelloPortTypeProxyid" scope="session"
		class="com.herongyang.www.Service.HelloPortTypeProxy" />
	<%
		System.out.println(request.getParameter("endpoint"));
		if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0) {
			sampleHelloPortTypeProxyid.setEndpoint(request.getParameter("endpoint"));
			System.out.println("asdf");
		} else {
			sampleHelloPortTypeProxyid.setEndpoint("http://localhost:8080/WebServiceProject/services/helloPort");
		}
		String helloInputPart_1id = request.getParameter("helloInputPart16");
		java.lang.String helloInputPart_1idTemp = "";
		String hello13mtemp = "";
		if (helloInputPart_1id != null && !helloInputPart_1id.equals("")) {
			helloInputPart_1idTemp = helloInputPart_1id;
			hello13mtemp = sampleHelloPortTypeProxyid.hello(helloInputPart_1idTemp);
		}
		if (hello13mtemp == null) {
	%>
	<%=hello13mtemp%>
	<%
		} else {
			String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(hello13mtemp));
	%>
			<%=tempResultreturnp14%>
	<%
		}
	%>

</BODY>
</HTML>