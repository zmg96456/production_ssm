/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-05-21 07:12:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class branch_005fadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<link href=\"js/kindeditor-4.1.10/themes/default/default.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/uploadfile.css\" rel=\"stylesheet\"> \r\n");
      out.write("<script src=\"js/jquery.uploadfile.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"js/kindeditor-4.1.10/kindeditor-all-min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" charset=\"utf-8\" src=\"js/kindeditor-4.1.10/lang/zh_CN.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<div style=\"padding:10px 10px 10px 10px\">\r\n");
      out.write("\t<form id=\"branchAddForm\" class=\"branchForm\" method=\"post\">\r\n");
      out.write("\t    <table cellpadding=\"5\" >\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>机构编号:</td>\r\n");
      out.write("\t            <td>\r\n");
      out.write("\t            \t<input class=\"easyui-textbox\" type=\"text\" name=\"id\" data-options=\"required:true\"/>\r\n");
      out.write("\t            </td>\r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        <tr>\r\n");
      out.write("\t            <td>机构名称:</td>\r\n");
      out.write("\t            <td>\r\n");
      out.write("\t            \t<input class=\"easyui-textbox\" type=\"text\" name=\"name\" \r\n");
      out.write("\t            \t\tdata-options=\"required:true\"/>\r\n");
      out.write("    \t\t\t</td>  \r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t       <tr>\r\n");
      out.write("\t            <td>机构简称:</td>\r\n");
      out.write("\t            <td>\r\n");
      out.write("\t            \t<input class=\"easyui-textbox\" type=\"text\" name=\"short_name\" \r\n");
      out.write("\t            \t\tdata-options=\"required:true\"/>\r\n");
      out.write("    \t\t\t</td>  \r\n");
      out.write("\t        </tr>\r\n");
      out.write("\t        \r\n");
      out.write("\t    </table>\r\n");
      out.write("\t    <input type=\"hidden\" name=\"branchParams\"/>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<div style=\"padding:5px\">\r\n");
      out.write("\t    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"submitBranchAddForm()\">提交</a>\r\n");
      out.write("\t    <a href=\"javascript:void(0)\" class=\"easyui-linkbutton\" onclick=\"clearBranchAddForm()\">重置</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//提交表单\r\n");
      out.write("\tfunction submitBranchAddForm(){\r\n");
      out.write("\t\t//有效性验证\r\n");
      out.write("\t\tif(!$('#branchAddForm').form('validate')){\r\n");
      out.write("\t\t\t$.messager.alert('提示','表单还未填写完成!');\r\n");
      out.write("\t\t\treturn ;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//ajax的post方式提交表单\r\n");
      out.write("\t\t//$(\"#branchAddForm\").serialize()将表单序列号为key-value形式的字符串\r\n");
      out.write("\t\t$.post(\"branch/insert\",$(\"#branchAddForm\").serialize(), function(data){\r\n");
      out.write("\t\t\tif(data.status == 200){\r\n");
      out.write("\t\t\t\t$.messager.alert('提示','新增机构成功!');\r\n");
      out.write("\t\t\t\tclearBranchAddForm();\r\n");
      out.write("\t\t\t\t$(\"#branchAddWindow\").window('close');\r\n");
      out.write("\t\t\t\t$(\"#branchList\").datagrid(\"reload\");\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$.messager.alert('提示',data.msg);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction clearBranchAddForm(){\r\n");
      out.write("\t\t$('#branchAddForm').form('reset');\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
