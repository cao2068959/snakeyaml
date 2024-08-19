package org.yaml.snakeyaml.serializer;

import org.yaml.snakeyaml.nodes.Node;

public class AliasNumberAnchorGenerator extends NumberAnchorGenerator {


    public AliasNumberAnchorGenerator(int lastAnchorId) {
        super(lastAnchorId);
    }

    @Override
    public String nextAnchor(Node node) {
        String alias = node.getAlias();
        if (alias != null && !"".equals(alias)) {
            return alias;
        }
        return super.nextAnchor(node);
    }
}
