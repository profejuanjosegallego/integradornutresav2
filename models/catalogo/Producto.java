@ManyToOne
@JoinColumn(name = "id_marca")
@JsonBackReference(value = "marca-producto")
private Marca marca;