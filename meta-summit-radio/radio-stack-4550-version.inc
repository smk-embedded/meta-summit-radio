BB_STRICT_CHECKSUM:summit-internal = "ignore"

PREMIRRORS:summit-internal = ""
MIRRORS:summit-internal = ""

SUMMIT_URI_LOCAL = "file://${TOPDIR}/../release"
SUMMIT_URI_BASE = "https://github.com/LairdCP/Sterling-LWB-and-LWB5-Release-Packages/releases/download/LRD-REL-${PV}"
SUMMIT_URI_BASE:summit-internal = "https://files.devops.rfpros.com/builds/linux"

require ../radio-stack-4550-hashes.inc
