package by.academy.rms.pojo;


import java.io.Serializable;
import java.util.Map;

public class PageProperty implements Serializable{
    private static final long serialVersionUID = 1l;

    private Integer id;
    private Page page;
    private Property property;
    private Map<LangCode,String> pagePropertyValue;

    public PageProperty(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Map<LangCode, String> getPagePropertyValue() {
        return pagePropertyValue;
    }

    public void setPagePropertyValue(Map<LangCode, String> pagePropertyValue) {
        this.pagePropertyValue = pagePropertyValue;
    }

    public String getValueByLangCode(LangCode langCode){
        if(langCode == null){
            return pagePropertyValue.get(property.getDefaultLangCode());
        }
        String value = pagePropertyValue.get(langCode);
        if(value == null){
            return pagePropertyValue.get(property.getDefaultLangCode());
        }
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PageProperty that = (PageProperty) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (page != null ? !page.equals(that.page) : that.page != null) return false;
        if (property != null ? !property.equals(that.property) : that.property != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (page != null ? page.hashCode() : 0);
        result = 31 * result + (property != null ? property.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PageProperty{" +
                "id=" + id +
//                ", page=" + page +
                ", property=" + property +
                ", pagePropertyValue=" + pagePropertyValue +
                '}';
    }
}
