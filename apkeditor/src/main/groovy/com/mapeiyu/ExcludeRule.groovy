package com.mapeiyu

class ExcludeRule {
    final String name
    List<String> excludeList = []

    ExcludeRule(String name) {
        this.name = name
    }

    void exclude(String... list) {
        excludeList += Arrays.asList(list)
    }
}