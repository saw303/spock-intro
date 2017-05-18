#!/usr/bin/env bash

./gradlew clean asciidoctor

BASEDIR=presentation/build
SOURCEDIR="$BASEDIR/asciidoc/revealjs"
WORKINGDIR="$BASEDIR/gh-pages"

mkdir -p $WORKINGDIR
cd $WORKINGDIR

git clone git@github.com:saw303/spock-intro.git

git checkout gh-pages

git rm -rf .

cp -r $SOURCEDIR/* $WORKINGDIR

git add .

git commit -m "Updated presentation"
git push

cd -
rm -rf $WORKINGDIR
