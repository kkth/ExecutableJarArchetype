# ExecutableJarArchetype

* 生成archetype
1. 在一个干净的项目根目录下执行
mvn archetype:create-from-project
就可以基于该项目生成archetype
2. 进入到项目的target/generated-sources/archetype目录下，例如
cd /Users/kunhe/code/ExeJar/target/generated-sources/archetype
执行
mvn install
就可以将生成的archetype安装到本地maven库中


* 使用archetype
需要基于该archetype生成新项目的时候
1. 在适当的目录下执行
mvn archetype:generate -DarchetypeCatalog=local
2. 根据提示选择自己创建的archetype，输入新的group id和artifact名字，就可以了
