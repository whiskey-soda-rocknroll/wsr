package by.academy.rms.pojo;


import java.io.Serializable;
import java.util.*;

public class Page implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String desc;
    private Date dateChange;
    private Set<PageProperty> pageProperties;

    public Page(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getDateChange() {
        return dateChange;
    }

    public void setDateChange(Date dateChange) {
        this.dateChange = dateChange;
    }

    public Set<PageProperty> getPageProperties() {
        return pageProperties;
    }

    public void setPageProperties(Set<PageProperty> pageProperties) {
        this.pageProperties = pageProperties;
    }

    public Properties getValuesByLangCode(LangCode langCode){
        Properties props = new Properties();
        for(PageProperty pp : pageProperties){
            String key = pp.getProperty().getName();
            String value = pp.getValueByLangCode(langCode);
            props.put(key, value);
        }
        return props;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Page page = (Page) o;

        if (dateChange != null ? !dateChange.equals(page.dateChange) : page.dateChange != null) return false;
        if (desc != null ? !desc.equals(page.desc) : page.desc != null) return false;
        if (id != null ? !id.equals(page.id) : page.id != null) return false;
        if (name != null ? !name.equals(page.name) : page.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        result = 31 * result + (dateChange != null ? dateChange.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Page{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", dateChange=" + dateChange +
                ", pageProperties=" + pageProperties +
                '}';
    }
}
