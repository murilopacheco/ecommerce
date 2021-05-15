package enums.relatorio;

public enum RelatorioTypeEnum {

    RECEITUARIO_ESPECIAL("relatorioteste.jasper", 0),
    RECEITUARIO_COMUM_JASPER("GoianiraReceituarioComum.jasper", 0),
	RECEITUARIO_COMUM_JRXML("GoianiraReceituarioComum.jrxml", 0),
    RECEITUARIO_ESPECIAL_DISPENSACAO("GoianiraReceituarioEspecial.jasper", 0),
    RECEITUARIO_ESPECIAL_DISPENSACAO_SUBREPORT("ReceituarioEspecialDispensacao.jasper", 0),
    RECEITUARIO_ESPECIAL_INTERCAMBIALIDADE_SUBREPORT("intercambialidade.jasper", 0),
	RECEITUARIO_ANTIMICROBIANO_JASPER("GoianiraReceituarioAntimicrobiano.jasper", 0),
	RECEITUARIO_ANTIMICROBIANO_JRXML("GoianiraReceituarioAntimicrobiano.jrxml", 0);

    private String templateName;
    private int col;

    RelatorioTypeEnum(String templateName,int col) {
        this.templateName = templateName;
        this.col = col;
    }

    public String getTemplateName() {
        return templateName;
    }

    public int getCol() {
        return col;
    }
}
