object Main extends App {
  val cheminFichierCSV = "chemin/vers/le/fichier/Tigres.csv" // Remplacez par le chemin réel de votre fichier CSV
  val tigres = ParseurCSV.parseCSV(cheminFichierCSV)

  tigres.foreach { tigre =>
    println(s"Nom: ${tigre.nom.getOrElse("Inconnu")}, Age: ${tigre.age.getOrElse("Non spécifié")}, Habitat: ${tigre.habitat.getOrElse("Non spécifié")}")
  }
}