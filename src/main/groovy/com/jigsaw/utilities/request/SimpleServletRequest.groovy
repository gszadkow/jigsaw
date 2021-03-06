package com.jigsaw.utilities.request

import javax.servlet.RequestDispatcher
import javax.servlet.ServletInputStream
import javax.servlet.http.Cookie
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpSession
import java.security.Principal

class SimpleServletRequest implements HttpServletRequest {

    @Override
    String getAuthType() {
        return null
    }

    @Override
    Cookie[] getCookies() {
        return new Cookie[0]
    }

    @Override
    long getDateHeader(String name) {
        return 0
    }

    @Override
    String getHeader(String name) {
        return null
    }

    @Override
    Enumeration getHeaders(String name) {
        return null
    }

    @Override
    Enumeration getHeaderNames() {
        return null
    }

    @Override
    int getIntHeader(String name) {
        return 0
    }

    @Override
    String getMethod() {
        return null
    }

    @Override
    String getPathInfo() {
        return null
    }

    @Override
    String getPathTranslated() {
        return null
    }

    @Override
    String getContextPath() {
        return null
    }

    @Override
    String getQueryString() {
        return null
    }

    @Override
    String getRemoteUser() {
        return null
    }

    @Override
    boolean isUserInRole(String role) {
        return false
    }

    @Override
    Principal getUserPrincipal() {
        return null
    }

    @Override
    String getRequestedSessionId() {
        return null
    }

    @Override
    String getRequestURI() {
        return null
    }

    @Override
    StringBuffer getRequestURL() {
        return null
    }

    @Override
    String getServletPath() {
        return null
    }

    @Override
    HttpSession getSession(boolean create) {
        return null
    }

    @Override
    HttpSession getSession() {
        return null
    }

    @Override
    boolean isRequestedSessionIdValid() {
        return false
    }

    @Override
    boolean isRequestedSessionIdFromCookie() {
        return false
    }

    @Override
    boolean isRequestedSessionIdFromURL() {
        return false
    }

    @Override
    boolean isRequestedSessionIdFromUrl() {
        return false
    }

    @Override
    Object getAttribute(String name) {
        return null
    }

    @Override
    Enumeration getAttributeNames() {
        return null
    }

    @Override
    String getCharacterEncoding() {
        return null
    }

    @Override
    void setCharacterEncoding(String e) throws UnsupportedEncodingException {

    }

    @Override
    int getContentLength() {
        return 0
    }

    @Override
    String getContentType() {
        return null
    }

    @Override
    ServletInputStream getInputStream() throws IOException {
        return null
    }

    @Override
    String getParameter(String name) {
        return null
    }

    @Override
    Enumeration getParameterNames() {
        return null
    }

    @Override
    String[] getParameterValues(String name) {
        return new String[0]
    }

    @Override
    Map getParameterMap() {
        return null
    }

    @Override
    String getProtocol() {
        return null
    }

    @Override
    String getScheme() {
        return null
    }

    @Override
    String getServerName() {
        return null
    }

    @Override
    int getServerPort() {
        return 0
    }

    @Override
    BufferedReader getReader() throws IOException {
        return null
    }

    @Override
    String getRemoteAddr() {
        return null
    }

    @Override
    String getRemoteHost() {
        return null
    }

    @Override
    void setAttribute(String name, Object o) {

    }

    @Override
    void removeAttribute(String name) {

    }

    @Override
    Locale getLocale() {
        return null
    }

    @Override
    Enumeration getLocales() {
        return null
    }

    @Override
    boolean isSecure() {
        return false
    }

    @Override
    RequestDispatcher getRequestDispatcher(String path) {
        return null
    }

    @Override
    String getRealPath(String path) {
        return null
    }

    @Override
    int getRemotePort() {
        return 0
    }

    @Override
    String getLocalName() {
        return null
    }

    @Override
    String getLocalAddr() {
        return null
    }

    @Override
    int getLocalPort() {
        return 0
    }
}
