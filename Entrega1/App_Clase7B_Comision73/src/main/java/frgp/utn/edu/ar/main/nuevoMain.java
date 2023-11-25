//PRIMER FORMA DE REALIZARLO:
	
	@OneToOne(cascade= {CascadeType.ALL}) //Tipo de relacion
	@JoinColumn(name="usuario_c")
	private Usuario usuario;
	