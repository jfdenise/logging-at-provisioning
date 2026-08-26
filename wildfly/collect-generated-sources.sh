#!/bin/bash
# Collects all generated-sources files from the provisioned server modules
# and copies them (preserving package directory structure) into generated-source-files/.
#
# Usage: ./collect-generated-sources.sh
# Run from any directory — paths are relative to the script's own location.

set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
SRC="$SCRIPT_DIR/wildfly-translations-feature-pack/galleon-pack/target/server/modules"
DEST="$SCRIPT_DIR/generated-source-files"

if [ ! -d "$SRC" ]; then
    echo "[ERROR] Source directory not found: $SRC"
    echo "        Has the server been provisioned? Run: cd wildfly-translations-feature-pack && mvn clean install"
    exit 1
fi

echo "[INFO]  Cleaning destination: $DEST"
rm -rf "$DEST"
mkdir -p "$DEST"

echo "[INFO]  Copying generated sources from: $SRC"
count=0
while IFS= read -r -d '' file; do
    rel="${file#*generated-sources/}"
    dest="$DEST/$rel"
    mkdir -p "$(dirname "$dest")"
    cp "$file" "$dest"
    count=$((count + 1))
done < <(find "$SRC" -path "*/generated-sources/*" -type f -print0)

echo "[INFO]  Copied $count file(s) to $DEST"
