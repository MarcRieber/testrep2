pipeline {
	agent any
	stages {
	stage('build') {
	steps {
		echo  " A STEP"
		dir("xxx") {
		 bat "mvn clean package"
		}
	}

	}
	}
	}
