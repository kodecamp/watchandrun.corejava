#!/bin/bash

find src/ | entr sh -c 'mvn package exec:java'
