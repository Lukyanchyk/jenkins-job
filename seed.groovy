job("get_xml"){
    scm {
        github('Lukyanchyk/jenkins-job', 'main')
    }
    steps {
        shell("""
            ls -l /var/lib/jenkins/jobs/
            rm -rf /var/lib/jenkins/jobs/*01
            pwd
            ls -l
            cp /var/lib/jenkins/workspace/get_xml/job/* /var/lib/jenkins/jobs/
            ls -l /var/lib/jenkins/jobs/
        """)
    }
}
