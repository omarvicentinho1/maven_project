job("job-DSL") {

  description("Job de practica utilizando Jenkins DSL")

  scm {
    git("https://github.com/omarvicentinho1/Sitio_Freelancer.git", 'main')
  }

  triggers {
    scm('* * * * *')
  }

  steps {
    maven('clean package', 'maven-prueba/pom.xml')
  }

  publishers {
    archiveArtifacts '**/*.jar'
  }
}
