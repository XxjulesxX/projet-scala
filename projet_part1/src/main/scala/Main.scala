object Main extends App {
  val cheminFichierCSV = "ressource/Tigres.csv" 
  val tigres = ParseurCSV.parseCSV(cheminFichierCSV)

  tigres.foreach { tigre =>
    println(s"Nom: ${tigre.nom.getOrElse("Inconnu")}, Age: ${tigre.age.getOrElse("Non spécifié")}, Habitat: ${tigre.habitat.getOrElse("Non spécifié")}")
  }
}