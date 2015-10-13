<%@page contentType="text/html;charset=UTF-8"%>
<HTML>
<HEAD>
<TITLE>Inputs</TITLE>
</HEAD>
<BODY>
	<H1>Inputs</H1>
	<FORM METHOD="POST" ACTION="Result.jsp" TARGET="result">
		<TABLE>
			<TR>
				<TD COLSPAN="1" ALIGN="LEFT">URL WSDL:</TD>
				<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="endpoint" SIZE=20></TD>
			</TR>
		</TABLE>
		<TABLE>
			<TR>
				<TD COLSPAN="1" ALIGN="LEFT">String dikirim:</TD>
				<TD ALIGN="left"><INPUT TYPE="TEXT" NAME="helloInputPart16"
					SIZE=20></TD>
			</TR>
		</TABLE>
		<BR> <INPUT TYPE="SUBMIT" VALUE="Kirim">
	</FORM>
</BODY>
</HTML>
