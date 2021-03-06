job('First-Maven-Project-via-DSL') {
  description("First Maven Job generated by the DSL on ${new Date()}, the project is a small Maven project hosted on GitHub")

  scm {
    git("https://github.com/omarvicentinho1/maven_project.git", 'main')
  }

  triggers {
    scm('* * * * *')
  }

  steps {
    maven('LocalMaven', 'clean package', 'maven-project/pom.xml')
  }

  publishers {
    archiveArtifacts '**/*.jar'
  }
}
