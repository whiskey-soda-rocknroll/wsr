package by.academy.rms.web.exception;

import by.academy.rms.dao.exception.DaoException;
import by.academy.rms.service.exception.ServiceException;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class UIException extends Exception {

    private UIErrorCode code;
    private Object[] params;
    private String message;
    private String date;
    private ServiceException serviceException;
    private DaoException daoException;
    private String fullCode;
    private Locale locale = Locale.getDefault();

    public UIException(UIErrorCode code, Object... params) {
	super();
	init(code, params);
    }

    public UIException(ServiceException e, UIErrorCode code, Object... params) {
	super(e);
	this.serviceException = e;
	if (e != null) {
	    daoException = e.getDaoException();
	}
	init(code, params);
    }

    private void init(UIErrorCode code, Object... params) {
	this.code = code;
	this.params = params;
	this.message = String.format(code.toString(), params);
	this.date = makeDate(new Date());
	this.fullCode = makeFullCode();
    }

    public UIErrorCode getCode() {
	return code;
    }

    public void setCode(UIErrorCode code) {
	this.code = code;
    }

    public Object[] getParams() {
	return params;
    }

    public void setParams(Object[] params) {
	this.params = params;
    }

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public ServiceException getServiceException() {
	return serviceException;
    }

    public void setServiceException(ServiceException serviceException) {
	this.serviceException = serviceException;
    }

    public DaoException getDaoException() {
	return daoException;
    }

    public void setDaoException(DaoException daoException) {
	this.daoException = daoException;
    }

    public String getFullCode() {
	return fullCode;
    }

    public void setFullCode(String fullCode) {
	this.fullCode = fullCode;
    }

    public String getDate() {
	return date;
    }

    public void setFDate(String date) {
	this.date = date;
    }

    public Locale getLocale() {
	return locale;
    }

    public void setLocale(Locale locale) {
	this.locale = locale;
    }

    private String makeDate(Date date) {

	DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, locale);

	String result = dateFormat.format(date);

	return result;
    }

    private String makeFullCode() {

	StringBuffer result = new StringBuffer(code.name() + "-");

	if (serviceException != null) {
	    result.append(serviceException.getCode().name() + "-");

	    if (daoException != null) {
		result.append(daoException.getCode().name() + "-");
	    }
	} else {
	    result.append(date);
	}
	return result.toString();
    }

}
