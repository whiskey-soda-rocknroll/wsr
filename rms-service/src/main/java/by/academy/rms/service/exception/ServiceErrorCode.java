package by.academy.rms.service.exception;

/**
 * Code for service exception
 *
 */

public enum ServiceErrorCode {
    //Pages
    RMS_SRVC_100("Failed to add page."),
    RMS_SRVC_101("Failed to update page."),
    RMS_SRVC_102("Failed to get page, id=%d."),
    RMS_SRVC_103("Failed to get page default name"),
    RMS_SRVC_104("Failed to field uniqueness validate");

    private final String value;

    private ServiceErrorCode(String s) {
	value = s;
    }

    public boolean equalsValue(String value2) {
	return (value2 != null) && value.equals(value2);
    }

    public String toString() {
	return value;
    }
}
