package comjava.mybatis_demo04.daomain;

public class Kecheng {


    private Integer xuhao;
    private String keche;
    private Integer ssid;

    @Override
    public String toString() {
        return "Kecheng{" +
                "xuhao=" + xuhao +
                ", keche='" + keche + '\'' +
                ", ssid=" + ssid +
                '}';
    }

    public Integer getXuhao() {
        return xuhao;
    }

    public void setXuhao(Integer xuhao) {
        this.xuhao = xuhao;
    }

    public String getKeche() {
        return keche;
    }

    public void setKeche(String keche) {
        this.keche = keche;
    }

    public Integer getSsid() {
        return ssid;
    }

    public void setSsid(Integer ssid) {
        this.ssid = ssid;
    }
}
