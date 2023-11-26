//PRIMER FORMA DE REALIZARLO:
	
	@OneToOne(cascade= {CascadeType.ALL}) //Tipo de relacion
package main;


	@JoinColumn(name="usuario_c")
	private Usuario usuario;
	