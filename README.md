# spock-stack-bug
Simple Java project demonstrating Spock Framework error

Open ASpec.groovy and choose "Run" in IntelliJ Idea.

Stack trace:

```
Exception in thread "main" java.lang.VerifyError: (class: com/example/ASpec, method: $spock_feature_0_0 signature: ()V) Stack size too large
    at java.lang.Class.getDeclaredFields0(Native Method)
    at java.lang.Class.privateGetDeclaredFields(Class.java:2499)
    at java.lang.Class.getDeclaredFields(Class.java:1811)
    at org.spockframework.runtime.SpecInfoBuilder.buildFields(SpecInfoBuilder.java:98)
    at org.spockframework.runtime.SpecInfoBuilder.doBuild(SpecInfoBuilder.java:69)
    at org.spockframework.runtime.SpecInfoBuilder.build(SpecInfoBuilder.java:54)
    at org.spockframework.runtime.Sputnik.getSpec(Sputnik.java:80)
    at org.spockframework.runtime.Sputnik.runExtensionsIfNecessary(Sputnik.java:88)
    at org.spockframework.runtime.Sputnik.getDescription(Sputnik.java:55)
    at com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:43)
    at com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:211)
    at com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:67)
    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke(Method.java:606)
    at com.intellij.rt.execution.application.AppMain.main(AppMain.java:134)
```
