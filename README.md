# Spring boot init archetype

This is archetype of simple hello world project written in spring boot.

## HOWTO

* `git clone https://github.com/zbyszekd/SpringBootInitArchetype.git`
* `cd SpringBootInitArchetype`
* `mvn install`
* go to path where you want to start project and run:
    
    ```
    mvn archetype:generate \
            -DarchetypeGroupId=com.zbyszekd \
            -DarchetypeArtifactId=spring-boot-init-archetype \
            -DarchetypeVersion=1.0.0-SNAPSHOT \
            -DgroupId=${project gorupId}\
            -DartifactId=${project artifactId} \
            -Dversion=${project version}
    ```