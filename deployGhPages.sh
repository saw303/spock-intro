#!/usr/bin/env bash

./gradlew clean asciidoctor

BASEDIR=presentation/build
SOURCEDIR="$BASEDIR/asciidoc/revealjs"
WORKINGDIR="$BASEDIR/gh-pages"

git clone git@github.com:saw303/spock-intro.git $WORKINGDIR

cd $WORKINGDIR

git checkout gh-pages

git rm -rf .

cp -r ../asciidoc/revealjs/*  .
mv spock-intro.html index.html

git add .

git commit -m "Updated presentation"
git push
