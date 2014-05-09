package logica;


public class Archivo {
	private String programa;
	private String estado;
	private String municipio;
	private Double superficie;
	private String unidad;
	private Double monto;
	private Integer comparar;
	
	
	public Archivo(){
		this.comparar = 1;
	}
	
	
	public Archivo(String programa, String estado, String municipio, Double superficie,
			String unidad, Double monto) {
		super();
		this.comparar = 1;
		this.programa = programa;
		this.estado = estado;
		this.municipio = municipio;
		this.superficie = superficie;
		this.unidad = unidad;
		this.monto = monto;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	
	
	public int compareTo(Archivo a){
		Integer com = 0;
		switch(this.comparar){
		case 1:
			com = this.programa.compareTo(a.getPrograma());
			if(com > 0){
				com = -1;
			}else if(com < 0 ){
				com = 1;
			}else{
				com = 0;
			}
			break;
			
		case 2:
			com = this.estado.compareTo(a.getEstado());
			if(com > 0){
				com = -1;
			}else if(com < 0 ){
				com = 1;
			}else{
				com = 0;
			}
			break;
			
		case 3:
			com = this.municipio.compareTo(a.getMunicipio());
			if(com > 0){
				com = -1;
			}else if(com < 0 ){
				com = 1;
			}else{
				com = 0;
			}
			break;
		
		case 4:
			com = this.superficie.compareTo(a.getSuperficie());
			break;
			
		case 5:
			com = this.unidad.compareTo(a.getUnidad());
			if(com > 0){
				com = -1;
			}else if(com < 0 ){
				com = 1;
			}else{
				com = 0;
			}
			break;
			
		case 6:
			com = this.monto.compareTo(a.getMonto());
			break;
		}
		
		return com;
	}
	
	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Double getSuperficie() {
		return superficie;
	}


	public void setSuperficie(Double superficie) {
		this.superficie = superficie;
	}


	public Double getMonto() {
		return monto;
	}


	public void setMonto(Double monto) {
		this.monto = monto;
	}


	public Integer getComparar() {
		return comparar;
	}


	public void setComparar(Integer comparar) {
		this.comparar = comparar;
	}


	public String toString(){
		return this.programa + " | " + this.municipio + " | " +  this.superficie + " | " + this.unidad + " | " + this.monto;
	}
	
	
}
