DESCRIPTION = "NCurses Disk Usage"
DEPENDS = "ncurses"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM="file://${WORKDIR}/ncdu-1.3/COPYING;md5=7317ecc362e0598e8f17500ed3295fe5"
PR = "r1"

SRC_URI = "http://dev.yorhel.nl/download/ncdu-${PV}.tar.gz"

inherit autotools

SRC_URI[md5sum] = "204bacb8376819059bec6c8287a87a67"
SRC_URI[sha256sum] = "f556a4b07c07bb66eabb5f2a20b3c52ea22020a68f2b5302d03e7b93b0ffee54"
