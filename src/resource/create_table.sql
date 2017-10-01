CREATE TABLE WhiteboardItem (
  ID         INTEGER PRIMARY KEY,
  USERNAME   TEXT      NOT NULL,
  CREATETIME TIMESTAMP NOT NULL,
  STATUS     BOOLEAN   NOT NULL
);
CREATE TABLE People (
  USERNAME  TEXT PRIMARY KEY    NOT NULL,
  FOREIGN KEY (WHITEBOARDID) REFERENCES WhiteboardItem (ID),
  ISMANAGER BOOLEAN             NOT NULL,
  STATUS    BOOLEAN             NOT NULL
);
CREATE TABLE ChatItem (
  ID       INTEGER PRIMARY KEY   NOT NULL,
  USERNAME TEXT                  NOT NULL,
  CHATTIME TIMESTAMP             NOT NULL,
  CONTENT  TEXT                  NOT NULL
);
CREATE TABLE CanvasItem (
  ID         INTEGER PRIMARY KEY    NOT NULL,
  FOREIGN KEY (MANAGERID) REFERENCES People (ID),
  CANVASNAME TEXT                   NOT NULL,
  CANVASPATH TEXT                   NOT NULL
);
CREATE TABLE DrawItem (
  ID         INTEGER PRIMARY KEY   NOT NULL,
  FOREIGN KEY (CANVASID) REFERENCES CanvasItem (ID),
  ACTIONNAME TEXT                  NOT NULL
);