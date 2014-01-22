package by.academy.rms.web.exception;

/**
 * Code for UI errors
 */

public enum UIErrorCode {

    RMS_UI_100("Cannot show pages"),
    RMS_UI_101("Cannot get page"),
    RMS_UI_102("Cannot create add page"),
    RMS_UI_103("Cannot add page"),
    RMS_UI_104("Cannot update page");

    private final String value;

    private UIErrorCode(String s) {
	value = s;
    }

    public boolean equalsValue(String value2) {
	return (value2 != null) && value.equals(value2);
    }

    public String toString() {
	return value;
    }
}
