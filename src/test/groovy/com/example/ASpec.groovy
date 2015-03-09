package com.example

import com.example.InMemoryConcurrentFooBarStorage.Abc
import spock.lang.Ignore
import spock.lang.Specification

class ASpec extends Specification {

    def subj = new InMemoryConcurrentFooBarStorage()

//    @Ignore // does not help
    def "throws"() {
        given:
//        Abc inAbc = anAbc("some name", "ns")
//        Abc abc = subj.createAbc(inAbc)
        Abc abc = subj.createAbc(anAbc("some name", "ns"))

        when:
        subj.createAbc(abc)

        then:
        thrown(NullPointerException)
    }

    private static Abc anAbc(String name, String ns) {
        Abc result = new Abc();
        return result;
    }
}
