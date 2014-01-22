package by.academy.rms.pojo;


import java.io.Serializable;

public class LangCode implements Serializable{
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String lang;
    private String countryCode;
    private String langCode;

    public LangCode(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LangCode langCode1 = (LangCode) o;

        if (countryCode != null ? !countryCode.equals(langCode1.countryCode) : langCode1.countryCode != null)
            return false;
        if (id != null ? !id.equals(langCode1.id) : langCode1.id != null) return false;
        if (lang != null ? !lang.equals(langCode1.lang) : langCode1.lang != null) return false;
        if (langCode != null ? !langCode.equals(langCode1.langCode) : langCode1.langCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (lang != null ? lang.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (langCode != null ? langCode.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LangCode{" +
                "id=" + id +
                ", lang='" + lang + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", langCode='" + langCode + '\'' +
                '}';
    }
}
