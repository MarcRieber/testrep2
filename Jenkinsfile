pipeline {
	agent any
	stages {
	stage('build') {
	steps {
		echo  " A STEP"
		dir("mylib") {
		 bat "mvn clean package"
		}
		dir("xxx") {
		 bat "mvn clean package"
		}
	}

	}
	}
	}
